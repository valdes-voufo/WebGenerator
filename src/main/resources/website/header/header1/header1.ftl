<header>
    <div class="header_l">
        <a>${ast.getName()} </a>
    </div>
    <div class="header_r">
        <nav class="navbar">
            <#list ast.getNavigation().getNavigationItemList() as navItem>
                ${tc.include("website/header/header1/navigatiomItem.ftl",navItem)}
            </#list>
        </nav >
    </div>


</header>
