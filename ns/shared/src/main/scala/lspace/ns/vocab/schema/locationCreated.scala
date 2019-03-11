package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object locationCreated extends PropertyDef(
        iri = "https://schema.org/locationCreated",
        iris = Set("https://schema.org/locationCreated"),
        label = "locationCreated",
        comment = """The location where the CreativeWork was created, which may not be the same as the location depicted in the CreativeWork.""",
        `@extends` = () => List(),
        `@range` = () => List(Place)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}