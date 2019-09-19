package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object fundedItem extends PropertyDef(
        iri = "http://schema.org/fundedItem",
        iris = Set("http://schema.org/fundedItem"),
        label = "fundedItem",
        comment = """Indicates an item funded or sponsored through a <a class="localLink" href="http://schema.org/Grant">Grant</a>.""",
        `@extends` = () => List(),
        `@range` = () => List(Thing.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}