package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object playerType extends PropertyDef(
        iri = "http://schema.org/playerType",
        iris = Set("http://schema.org/playerType"),
        label = "playerType",
        comment = """Player type required&#x2014;for example, Flash or Silverlight.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}