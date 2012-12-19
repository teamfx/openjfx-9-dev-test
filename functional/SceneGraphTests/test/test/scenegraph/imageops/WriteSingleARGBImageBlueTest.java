/*
 * Copyright (c) 2012, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
package test.scenegraph.imageops;

/**
 *
 * @author Alexander Petrov
 */
public class WriteSingleARGBImageBlueTest extends WriteSingleARGBImageTestBase{

    @Override
    protected ColorComponentProvider getColorComponentProvider() {
        return ColorComponents.Blue;
    }
}