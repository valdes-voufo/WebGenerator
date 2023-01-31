<!-- ======= Header ======= -->
<header id="header" class="fixed-top d-flex align-items-center ">
    <div class="container d-flex justify-content-between align-items-center">

        <div id="logo">
            <h1><a href="#">${ast.getName()}</a></h1>
        </div>

        <nav id="navbar" class="navbar">
            <ul>
                <#list ast.getNavigation().getNavigationItemList() as navItem>
                    ${tc.include("website/header/header2/navigationItem.ftl",navItem)}
                </#list>
            </ul>
            <i class="bi bi-list mobile-nav-toggle"></i>
        </nav><!-- .navbar -->
    </div>
</header><!-- End Header -->