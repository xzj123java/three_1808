package com.xa.pojo;

public class Userone {
    int U_id;
    String U_name;
    String U_pass;

    public int getU_id(int i) {
        return U_id;
    }

    @Override
    public String toString() {
        return "Userone{" +
                "U_id=" + U_id +
                ", U_name='" + U_name + '\'' +
                ", U_pass='" + U_pass + '\'' +
                '}';
    }

    public void setU_id(int u_id) {
        U_id = u_id;
    }

    public String getU_name() {
        return U_name;
    }

    public void setU_name(String u_name) {
        U_name = u_name;
    }

    public String getU_pass() {
        return U_pass;
    }

    public void setU_pass(String u_pass) {
        U_pass = u_pass;
    }
}
