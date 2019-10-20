package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object artEdition extends PropertyDef(
        iri = "http://schema.org/artEdition",
        iris = Set("http://schema.org/artEdition"),
        label = "artEdition",
        comment = """The number of copies when multiple copies of a piece of artwork are produced - e.g. for a limited edition of 20 prints, 'artEdition' refers to the total number of copies (in this example "20").""",
        `@extends` = List(),
        `@range` = List(`@int`, `@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}