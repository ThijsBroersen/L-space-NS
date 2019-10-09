package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object structuralClass extends PropertyDef(
        iri = "http://schema.org/structuralClass",
        iris = Set("http://schema.org/structuralClass"),
        label = "structuralClass",
        comment = """The name given to how bone physically connects to each other.""",
        `@extends` = List(),
        `@range` = List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}