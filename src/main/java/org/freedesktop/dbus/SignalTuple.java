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

final class SignalTuple
{
   String type;
   String name;
   String object;
   String source;
   public SignalTuple(String type, String name, String object, String source)
   {
      this.type = type;
      this.name = name;
      this.object = object;
      this.source = source;
   }
   @Override
   public boolean equals(Object o)
   {
      if (o == null || !(o instanceof SignalTuple)) return false;
      final SignalTuple that = (SignalTuple) o;
      return Objects.equals(this.type, that.type)
          && Objects.equals(this.name, that.name)
          && Objects.equals(this.object, that.object)
          && Objects.equals(this.source, that.source);
   }
   @Override
   public int hashCode()
   {
      return Objects.hash(type, name, source, object);
   }
   @Override
   public String toString()
   {
      return "SignalTuple("+type+","+name+","+object+","+source+")";
   }
}

