package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object repetitions extends PropertyDef(
        iri = "http://schema.org/repetitions",
        iris = Set("http://schema.org/repetitions"),
        label = "repetitions",
        comment = """Number of times one should repeat the activity.""",
        `@extends` = () => List(),
        `@range` = () => List(QualitativeValue.ontology, `@number`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}