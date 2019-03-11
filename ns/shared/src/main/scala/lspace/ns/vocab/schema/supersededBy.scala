package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object supersededBy extends PropertyDef(
        iri = "https://schema.org/supersededBy",
        iris = Set("https://schema.org/supersededBy"),
        label = "supersededBy",
        comment = """Relates a term (i.e. a property, class or enumeration) to one that supersedes it.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}