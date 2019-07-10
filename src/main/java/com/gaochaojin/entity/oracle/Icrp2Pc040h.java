package com.gaochaojin.entity.oracle;

import javax.persistence.Column;

/**
 * null
 *
 * @author null
 * @date   2019-07-03
 */
public class Icrp2Pc040h extends Icrp2Pc040hKey {
    /**
     * null
     */
    @Column(name = "PC040D01")
    private String pc040d01;

    /**
     * null
     */
    @Column(name = "PC040S02")
    private String pc040s02;

    /**
     * null
     */
    @Column(name = "PC040J01")
    private String pc040j01;

    public String getPc040d01() {
        return pc040d01;
    }

    public void setPc040d01(String pc040d01) {
        this.pc040d01 = pc040d01 == null ? null : pc040d01.trim();
    }

    public String getPc040s02() {
        return pc040s02;
    }

    public void setPc040s02(String pc040s02) {
        this.pc040s02 = pc040s02 == null ? null : pc040s02.trim();
    }

    public String getPc040j01() {
        return pc040j01;
    }

    public void setPc040j01(String pc040j01) {
        this.pc040j01 = pc040j01 == null ? null : pc040j01.trim();
    }
}