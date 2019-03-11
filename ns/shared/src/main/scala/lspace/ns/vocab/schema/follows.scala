package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object follows extends PropertyDef(
        iri = "https://schema.org/follows",
        iris = Set("https://schema.org/follows"),
        label = "follows",
        comment = """The most generic uni-directional social relation.""",
        `@extends` = () => List(),
        `@range` = () => List(Person)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}