/*
 * Copyright (c) 1998 Sun Microsystems, Inc. All Rights Reserved.
 */

package com.sun.xml.dtdparser;


final class InternalEntity extends EntityDecl {
    InternalEntity(String name, char value []) {
        this.name = name;
        this.buf = value;
    }

    char buf [];
}
