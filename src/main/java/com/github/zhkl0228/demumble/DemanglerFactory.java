package com.github.zhkl0228.demumble;

public class DemanglerFactory {

    private static boolean nativeDemanglerAvailable;
    private static boolean initializeNativeDemanglerFailed;

    public static GccDemangler createDemangler() {
        if (initializeNativeDemanglerFailed) {
            return new JavaDemangler();
        }
        try {
            NativeDemangler demangler = new NativeDemangler();
            if (!nativeDemanglerAvailable) {
                demangler.demangle("");
                nativeDemanglerAvailable = true;
            }
            return new NativeDemangler();
        } catch (Throwable ignored) {
            initializeNativeDemanglerFailed = true;
            return new JavaDemangler();
        }
    }

}
