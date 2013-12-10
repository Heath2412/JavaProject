<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!-- header -->
<div id="header" class="row" style="background-color: #223d62;">

    <!-- upper header -->
    <div id="upper-header" class="row">
        <div id="logo" class="col-md-2">
            <img src="content/images/logo-school.png" alt="Logo z" />
        </div>

        <div class="col-md-21 pad-hor-10">
            <form class="navbar-form col-md-6 pad-ver-10" role="search">
                <div class="form-group">
                    <input type="text" class="form-control" style="width: 230px;" placeholder="Tìm kiếm">
                </div>
                <button type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-search"></span></button>
            </form>

            <!-- login -->
            <form class="navbar-form navbar-right pad-5">
                <div class="col-md-12 col-md-offset-2">
                    <div class="form-group input-group-sm">
                        <input type="text" class="form-control" placeholder="Username">
                    </div>
                    <div class="form-group input-group-sm pad-top-5">
                        <input type="password" class="form-control" placeholder="Password">
                    </div>
                </div>
                <div class="col-md-10 pad-2" style="margin-left: -40px;">
                    <input type="submit" class="btn btn-primary btn-xs" value="Đăng nhập" style="width: 40%;"/>
                    <a class="btn btn-info btn-xs" style="width: 40%;" href="#">Đăng ký</a>
                    <br />
                    <div class="pad-top-15">
                        <input type="checkbox" /> <span style="color:white;">Ghi nhớ</span>
                    </div>
                </div>
            </form>
            <!-- end login -->
        </div>
    </div>
    <!-- end upper header -->

    <!-- lower header -->
    <div id="lower header" class="row">
        <div class="nav-collapse">
            <nav class="navbar navbar-inverse" role="navigation">
                <ul class="nav navbar-nav">
                    <!-- products dropdown -->
                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Sản phẩm<b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li class="dropdown-submenu">
                                <a tabindex="-1" href="#">Cameras & Camcorders</a>
                                <ul class="dropdown-menu">
                                    <li>
                                        <div style="width: 500px;"></div>
                                        <div class="row">
                                            <div class="col-md-10" style="padding-left: 40px; width: 50%">
                                                DIGITAL CAMERAS
                                                <ul class="pad-2 sub-menu" style="list-style: none;">
                                                    <li><a href="#">Digital SLR Cameras</a></li>
                                                    <li><a href="#">Compact System Cameras</a></li>
                                                    <li><a href="#">Point & Shoot Cameras</a></li>
                                                    <li><a href="#">Camera Lenses</a></li>
                                                    <li><a href="#">Memory Cards</a></li>
                                                    <li><a href="#">Digital Camera Accessories</a></li>
                                                    <li class="no-pad divider"></li>
                                                    <li><a href="#">Photo Printers</a></li>
                                                    <li><a href="#">Digital Photo Frames</a></li>
                                                    <li><a href="#">Binoculars, Telescopes & Optics</a></li>
                                                    <li><a href="#">Home Security & Surveillance</a></li>
                                                    <li><a href="#">Webcams</a></li>
                                                </ul>
                                            </div>
                                            <div class="col-md-10" style="width: 50%">
                                                CAMCORDERS
                                                <ul class="pad-2 sub-menu" style="list-style: none;">
                                                    <li><a href="#">High-Definition Camcorders</a></li>
                                                    <li><a href="#">Action Camcorders</a></li>
                                                    <li><a href="#">Camcorder Package Deals</a></li>
                                                    <li>
                                                        <a href="#">Camcorder Accessories</a><br />
                                                        <h5 style="margin-top: 0px"><small>Bags, Batteries, Memory Cards & More</small></h5>
                                                    </li>
                                                    <li class="no-pad divider"></li>
                                                    <li>
                                                        <div class="row">
                                                            <div class="no-pad pad-left-5 col-md-6">
                                                                <img src="http://images.bestbuy.com/BestBuy_US//store/images/global/header/gs_logo.gif" />
                                                            </div>
                                                            <div class="col-md-18">
                                                                <a href="#">Camera & Camcorder Services</a>
                                                            </div>
                                                        </div>
                                                    </li>
                                                </ul>
                                            </div>
                                        </div>
                                    </li>
                                </ul>
                            </li>
                        </ul>
                    </li>
                    <!-- end products drop down -->
                    <li><a class="navbar-brand" href="#"><strong>Deal hàng tuần</strong></a></li>
                    <li><a href="#">Cửa hàng</a></li>
                    <li><a href="#">Đơn đặt hàng</a></li>
                    <li><a href="#">Trợ giúp</a></li>
                    <li><a href="#">Thẻ tín dụng</a></li>
                </ul>
                <!-- shopping cart -->
                <ul class="nav navbar-nav navbar-right">
                    <li>
                        <div style="font-size: 40px; color: white; margin-right: 50px; top: 22px;" class="glyphicon glyphicon-shopping-cart">
                            <div style="color:black; font-size: 20px; width:30px; height: 30px; background-color:yellow;
                                 border-radius: 50px; position:relative; bottom: 60px; right: 10px; text-align:center">
                                5
                            </div>
                        </div>
                    </li>
                </ul>
                <!-- end shopping cart -->
            </nav>

        </div>
        <!--/.nav-collapse -->
    </div>
    <!-- end lower header -->

</div>
<!-- end header -->