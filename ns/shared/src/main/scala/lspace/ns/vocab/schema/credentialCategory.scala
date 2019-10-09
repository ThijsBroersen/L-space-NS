package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object credentialCategory extends PropertyDef(
        iri = "http://schema.org/credentialCategory",
        iris = Set("http://schema.org/credentialCategory"),
        label = "credentialCategory",
        comment = """The category or type of credential being described, for example "degree”, “certificate”, “badge”, or more specific term.""",
        `@extends` = List(),
        `@range` = List(`@string`, URL.ontology, DefinedTerm.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}