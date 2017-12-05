package com.test;

import spock.lang.Specification;

class TravisTest extends Specification {
    def 'test a'() {
        given:
        def a = 123;
        when:
        println("----------a is:$a----------");
        then:
        true
    }
}
