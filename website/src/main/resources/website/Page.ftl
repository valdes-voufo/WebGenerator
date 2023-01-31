<!--
 @param ast  ASTPage
-->
<!--introduce the variable website as ASTWebsite-->
${tc.signature("website")}

<!DOCTYPE html>
<html lang="en">

<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">

    <meta charset="UTF-8">
    <link href="${ast.getName()}.css" rel="stylesheet">
    <title>${website.getName()}</title>
</head>

<body>

<#if website.isPresentNavigation()>
    ${tc.include("website/header/header2/header2.ftl",website)}
</#if>

<main>
    <div class="main_content">
        <#if ast.getPageContent().getPageContentElement(0).isLandImage()>
            <section id="hero" style="background: url(resources/${ast.getPageContent().getPageContentElement(0).getPicture()}.png) top center">
                <div class="hero-container" data-aos="zoom-in" data-aos-delay="100">
                    <h1>${ast.getPageContent().getPageContentElement(0).getTitle()}</h1>
                    <h2>${ast.getPageContent().getPageContentElement(0).getSubtitle()}</h2>
                    <a class="btn-get-started" href="#gap">Weiter</a>
                </div>
            </section>
            <div id="gap"></div>
        </#if>

        <#if ast.isPresentTitle()><h1>${ast.getTitle()}</h1></#if>
        <#list ast.getPageContent().getPageContentElementList() as element>
            ${tc.include("website/PageItem.ftl", element)}
        </#list>
    </div>
</main>


<!-----------------------generate-footer------------------------- -->
${tc.include("website/footer/footer1/footer1.ftl",website)}

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
        crossorigin="anonymous"></script>
</body>
</html>




