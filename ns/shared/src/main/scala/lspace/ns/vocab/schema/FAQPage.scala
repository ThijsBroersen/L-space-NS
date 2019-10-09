package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object FAQPage extends OntologyDef(
        iri = "http://schema.org/FAQPage",
        iris = Set("http://schema.org/FAQPage"),
        label = "FAQPage",
        comment = """A <a class="localLink" href="http://schema.org/FAQPage">FAQPage</a> is a <a class="localLink" href="http://schema.org/WebPage">WebPage</a> presenting one or more "<a href="https://en.wikipedia.org/wiki/FAQ">Frequently asked questions</a>" (see also <a class="localLink" href="http://schema.org/QAPage">QAPage</a>).""",
        `@extends` = List(WebPage.ontology)
       ){
object keys extends lspace.ns.vocab.schema.WebPage.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.WebPage.Properties{

}
}