package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object actionAccessibilityRequirement extends PropertyDef(
        iri = "http://schema.org/actionAccessibilityRequirement",
        iris = Set("http://schema.org/actionAccessibilityRequirement"),
        label = "actionAccessibilityRequirement",
        comment = """A set of requirements that a must be fulfilled in order to perform an Action. If more than one value is specied, fulfilling one set of requirements will allow the Action to be performed.""",
        `@extends` = () => List(),
        `@range` = () => List(ActionAccessSpecification.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}