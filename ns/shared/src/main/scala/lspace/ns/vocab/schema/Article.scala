package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Article extends OntologyDef(
        iri = "http://schema.org/Article",
        iris = Set("http://schema.org/Article"),
        label = "Article",
        comment = """An article, such as a news article or piece of investigative report. Newspapers and magazines have articles of many different types and this is intended to cover them all.<br/><br/>

See also <a href="http://blog.schema.org/2014/09/schemaorg-support-for-bibliographic_2.html">blog post</a>.""",
        `@extends` = () => List(CreativeWork.ontology)
       ){
}