package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object comment extends PropertyDef(
        iri = "https://schema.org/comment",
        iris = Set("https://schema.org/comment"),
        label = "comment",
        comment = """Comments, typically from users.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}