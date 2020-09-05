package com.github.zhkl0228.demumble;

public class DemanglerFactory {

    private static boolean nativeDemanglerAvailable;

    public static GccDemangler createDemangler() {
        try {
            NativeDemangler demangler = new NativeDemangler();
            if (!nativeDemanglerAvailable) {
                demangler.demangle("");
                nativeDemanglerAvailable = true;
            }
            return new NativeDemangler();
        } catch (Throwable ignored) {
            return new JavaDemangler();
        }
    }

}
