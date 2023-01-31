<#if ast.isEmptySubItem()>
    <li><a class="nav-link scrollto "href="${ast.getName()}.html">${ast.getName()}</a></li>
<#else >
        <li class="dropdown"><a href="#"><span>${ast.getName()}</span> <i class="bi bi-chevron-down"></i></a>
        <ul>
            <#list ast.getSubItemList() as subItem>
                ${tc.include("website/header/header1/navigatiomItem.ftl",subItem)}
            </#list>
        </ul>
        </li>
</#if>
