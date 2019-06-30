package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object SatiricalArticle extends OntologyDef(
        iri = "http://schema.org/SatiricalArticle",
        iris = Set("http://schema.org/SatiricalArticle"),
        label = "SatiricalArticle",
        comment = """An <a class="localLink" href="http://schema.org/Article">Article</a> whose content is primarily <a href="https://en.wikipedia.org/wiki/Satire">[satirical]</a> in nature, i.e. unlikely to be literally true. A satirical article is sometimes but not necessarily also a <a class="localLink" href="http://schema.org/NewsArticle">NewsArticle</a>. <a class="localLink" href="http://schema.org/ScholarlyArticle">ScholarlyArticle</a>s are also sometimes satirized.""",
        `@extends` = () => List(Article.ontology)
       ){
}