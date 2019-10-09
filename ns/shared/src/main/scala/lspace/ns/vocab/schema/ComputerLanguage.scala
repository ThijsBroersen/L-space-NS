package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ComputerLanguage extends OntologyDef(
        iri = "http://schema.org/ComputerLanguage",
        iris = Set("http://schema.org/ComputerLanguage"),
        label = "ComputerLanguage",
        comment = """This type covers computer programming languages such as Scheme and Lisp, as well as other language-like computer representations. Natural languages are best represented with the <a class="localLink" href="http://schema.org/Language">Language</a> type.""",
        `@extends` = List(Intangible.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Intangible.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.Intangible.Properties{

}
}