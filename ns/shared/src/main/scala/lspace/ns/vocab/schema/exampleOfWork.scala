package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object exampleOfWork extends PropertyDef(
        iri = "http://schema.org/exampleOfWork",
        iris = Set("http://schema.org/exampleOfWork"),
        label = "exampleOfWork",
        comment = """A creative work that this work is an example/instance/realization/derivation of.""",
        `@extends` = () => List(),
        `@range` = () => List(CreativeWork.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}