<#if ast.isEmptySubItem()>
    <a href="${ast.getName()}.html">${ast.getName()}</a>

<#else >
    <div class="dropdown">
        <button  class="dropbtn" id="headerBTN">${ast.getName()}
        </button>
        <div class="dropdown-content">
            <#list ast.getSubItemList() as subItem>
                ${tc.include("website/header/header1/navigatiomItem.ftl",subItem)}
            </#list>
        </div>
    </div>
</#if>

