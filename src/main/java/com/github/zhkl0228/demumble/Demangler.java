package com.github.zhkl0228.demumble;

import java.io.IOException;

public class Demangler {

  static {
      try {
         org.scijava.nativelib.NativeLoader.loadLibrary("demumble");
      } catch (IOException e) {
         throw new IllegalStateException(e);
      }
  }

  public static native String demangle(String mangled);

}

