package com.github.zhkl0228.demumble;

import de.fearlesstobi.demangler.Demangler;

class JavaDemangler implements GccDemangler {

    @Override
    public String demangle(String mangled) {
        return Demangler.parse(mangled);
    }

}
