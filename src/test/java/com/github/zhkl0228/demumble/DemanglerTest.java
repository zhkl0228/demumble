package com.github.zhkl0228.demumble;

import junit.framework.TestCase;

public class DemanglerTest extends TestCase {

  public void testDemangler() {
    System.out.println(Demangler.demangle("__ZNSt3__114__thread_proxyINS_5tupleIJNS_10unique_ptrINS_15__thread_structENS_14default_deleteIS3_EEEEMN6hilive5media18EditorVideoHandlerEFvRKNS_3mapIjNS8_5TrackENS_4lessIjEENS_9allocatorINS_4pairIKjSB_EEEEEEEPS9_SJ_EEEEEPvSQ_"));
  }

}

