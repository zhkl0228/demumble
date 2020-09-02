package com.github.zhkl0228.demumble;

public class Demangler {

  static {
      try {
         org.scijava.nativelib.NativeLoader.loadLibrary("demumble");
      } catch (Exception ignored) {
      }
  }

  public static native String demangle(String mangled);

}

