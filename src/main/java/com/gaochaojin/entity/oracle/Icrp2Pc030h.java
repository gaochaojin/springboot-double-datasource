package com.gaochaojin.entity.oracle;

import javax.persistence.Column;

/**
 * null
 *
 * @author null
 * @date   2019-07-03
 */
public class Icrp2Pc030h extends Icrp2Pc030hKey {
    /**
     * null
     */
    @Column(name = "PC030D01")
    private String pc030d01;

    /**
     * null
     */
    @Column(name = "PC030S02")
    private String pc030s02;

    /**
     * null
     */
    @Column(name = "PC030J01")
    private String pc030j01;

    public String getPc030d01() {
        return pc030d01;
    }

    public void setPc030d01(String pc030d01) {
        this.pc030d01 = pc030d01 == null ? null : pc030d01.trim();
    }

    public String getPc030s02() {
        return pc030s02;
    }

    public void setPc030s02(String pc030s02) {
        this.pc030s02 = pc030s02 == null ? null : pc030s02.trim();
    }

    public String getPc030j01() {
        return pc030j01;
    }

    public void setPc030j01(String pc030j01) {
        this.pc030j01 = pc030j01 == null ? null : pc030j01.trim();
    }
}