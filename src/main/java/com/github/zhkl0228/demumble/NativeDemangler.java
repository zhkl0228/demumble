package com.github.zhkl0228.demumble;

class NativeDemangler implements GccDemangler {

    @Override
    public String demangle(String mangled) {
        if (mangled == null) {
            throw new NullPointerException();
        }

        return Demangler.demangle(mangled);
    }

}
