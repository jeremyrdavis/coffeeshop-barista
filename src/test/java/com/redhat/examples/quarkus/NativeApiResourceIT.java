package com.redhat.examples.quarkus;

import io.quarkus.test.junit.NativeImageTest;

@NativeImageTest
public class NativeApiResourceIT extends ApiResourceTest {

    // Execute the same tests but in native mode.
}