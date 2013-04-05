/*
   D-Bus Java Implementation
   Copyright (c) 2005-2006 Matthew Johnson

   This program is free software; you can redistribute it and/or modify it
   under the terms of either the GNU Lesser General Public License Version 2 or the
   Academic Free Licence Version 2.1.

   Full licence texts are included in the COPYING file with this program.
*/
package org.freedesktop.dbus;

import java.util.Objects;

import cx.ath.matthew.debug.Debug;

final class MethodTuple
{
   String name;
   String sig;
   public MethodTuple(String name, String sig)
   {
      this.name = name;
      if (null != sig)
         this.sig = sig;
      else
         this.sig = "";
      if (Debug.debug) Debug.print(Debug.VERBOSE, "new MethodTuple("+this.name+", "+this.sig+")");
   }
   @Override
   public boolean equals(Object o)
   {
      if (o == null || (!(o instanceof MethodTuple))) {
          return false;
      }
      final MethodTuple that = (MethodTuple) o;
      return Objects.equals(this.name, that.name)
          && Objects.equals(this.sig, that.sig);
   }
   @Override
   public int hashCode()
   {
      return Objects.hash(name, sig);
   }
}
