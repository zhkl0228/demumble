package com.github.zhkl0228.demumble;

class NativeDemangler implements GccDemangler {

    @Override
    public String demangle(String mangled) {
        return Demangler.demangle(mangled);
    }

}
