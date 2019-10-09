package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object CssSelectorType extends OntologyDef(
        iri = "http://schema.org/CssSelectorType",
        iris = Set("http://schema.org/CssSelectorType"),
        label = "CssSelectorType",
        comment = """Text representing a CSS selector.""",
        `@extends` = List()
       ){
object keys {

}
override lazy val properties: List[LProperty] = List()
trait Properties {

}
}