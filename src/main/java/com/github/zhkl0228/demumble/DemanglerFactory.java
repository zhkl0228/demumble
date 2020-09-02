package com.github.zhkl0228.demumble;

public class DemanglerFactory {

    public static GccDemangler createDemangler() {
        try {
            Demangler.demangle("");
            return new NativeDemangler();
        } catch (Throwable ignored) {
            return new JavaDemangler();
        }
    }

}
