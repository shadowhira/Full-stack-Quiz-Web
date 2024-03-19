package com.example.BTWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String homepage() {
        return "index";
    }
    @RequestMapping("/index.html")
    public String homepage2() {
        return "index";
    }
    @RequestMapping("/features/chinh-sua-ky-thi.html")
    public String chinhSuaKyThi() {
        return "features/chinh-sua-ky-thi.html";
    }

    @RequestMapping("/features/dang-nhap.html")
    public String dangNhap() {
        return "features/dang-nhap.html";
    }

    @RequestMapping("/features/dang-ky.html")
    public String dangKy() {
        return "features/dang-ky.html";
    }

    @RequestMapping("/features/dashboard-admin.html")
    public String dashboardAdmin() {
        return "features/dashboard-admin.html";
    }

    @RequestMapping("/assets/features/dashboard-admin.html")
    public String dashboardAdmin2() {
        return "features/dashboard-admin.html";
    }

    @RequestMapping("/features/tao-ky-thi.html")
    public String taoKyThi() {
        return "features/tao-ky-thi.html";
    }

    @RequestMapping("/features/thay-doi-mat-khau.html")
    public String thayDoiMatKhau() {
        return "features/thay-doi-mat-khau.html";
    }

    @RequestMapping("/features/trang-bai-thi.html")
    public String trangBaiThi() {
        return "features/trang-bai-thi.html";
    }

    @RequestMapping("/features/trang-dang-nhap-admin.html")
    public String trangDangNhapAdmin() {
        return "features/trang-dang-nhap-admin.html";
    }

    @RequestMapping("/features/trang-ket-qua.html")
    public String trangKetQua() {
        return "features/trang-ket-qua.html";
    }

    @RequestMapping("/features/trang-ket-qua-admin.html")
    public String trangKetQuaAdmin() {
        return "features/trang-ket-qua-admin.html";
    }

    @RequestMapping("/features/trang-thong-ke.html")
    public String trangThongKe() {
        return "features/trang-thong-ke.html";
    }
}
