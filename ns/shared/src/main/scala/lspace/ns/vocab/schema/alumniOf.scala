package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object alumniOf extends PropertyDef(
        iri = "https://schema.org/alumniOf",
        iris = Set("https://schema.org/alumniOf"),
        label = "alumniOf",
        comment = """An organization that the person is an alumni of.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}