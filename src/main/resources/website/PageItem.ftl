

<#if ast.isParagraph() >
<!--print a paragraph-->
    <div class="paragraph container">
        <p>${ast.getText()}</p>
    </div>
</#if>



<#if ast.isLink() >
<!--print a link-->
    <div class="link">
        <#if ast.isPresentTitle() >
             <a href="${ast.getName()}.html">${ast.getTitle()}</a>
        <#else>
            <a href="${ast.getName()}.html">${ast.getName()}</a>
        </#if>
    </div>
</#if>



<#if ast.isPicture() >
<!--print a picture-->
    <div class="image">
        <img src="resources/${ast.getName()}.png" alt="${ast.getName()}" height="${ast.getHeight().getValue()}" width="${ast.getWidth().getValue()}"/>
    </div>
</#if>



<#if ast.isTextBlock() >
<!--print a textblock-->
    <div class="textBlock container shadow rounded mb-3">
        <h2>${ast.getTitle()}</h2>

        <#list ast.getParagraphList() as p>
            <p>${p.getText()}</p>
        </#list>
    </div>
</#if>



<#if ast.isCodeBlock() >
<!--print a codeblock-->
    <pre>
      <code>
        <#list ast.getParagraphList() as p>
            <p>${p.getText()}</p>
        </#list>
      </code>
   </pre>
</#if>



<#if ast.isAside() >
<!--print an aside element-->
    <aside>
        <#list ast.getSubItemList() as aside_element>
            ${tc.include("website/PageItem.ftl",aside_element)}
        </#list>
    </aside>
</#if>



<#if ast.isCard() >
<!--print a card-->
    <div class="mx-auto" style="width: 390px;">
        <div class="card shadow rounded border-0">
            <img alt="..." class="card-img-top"  src="resources/${ast.getPicture()}.png" >
            <div class="card-body">
                <h5 class="card-title">${ast.getTitle()}</h5>
                <p class="card-text">${ast.getParagraph().getText()}</p>
                <a class="btn btn-primary" href="${ast.getLink()}.html">mehr erfahren</a>
            </div>
        </div>
    </div>
</#if>



<#if ast.isTable() >
<!--print a table-->
    <table class="table caption-top">
        <caption>${ast.getTitle()}</caption>
        <thead>
        <tr class="table-dark">
            <#list ast.getHead() as element>
                <th scope="col">${element}</th>
            </#list>
        </tr>
        </thead>

        <tbody>
        <#list ast.getContains() as line>
            <tr>
                <#list line as element>
                    <td >${element}</td>
                </#list>
            </tr>
        </#list>

        </tbody>
    </table>
</#if>



<#if ast.isRow()>
<!--print a row-->
    <div class="container">
        <div class="row">
            <#list ast.getPageContentElementList()as element>
                <div class="col-sm-${ast.getColSize()}" data-aos="zoom-in">
                    ${tc.include("website/PageItem.ftl",element)}
                </div>
            </#list>

        </div>
    </div>
</#if>


