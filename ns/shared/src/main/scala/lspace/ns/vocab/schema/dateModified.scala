package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object dateModified extends PropertyDef(
        iri = "https://schema.org/dateModified",
        iris = Set("https://schema.org/dateModified"),
        label = "dateModified",
        comment = """The date on which the CreativeWork was most recently modified or when the item's entry was modified within a DataFeed.""",
        `@extends` = () => List(),
        `@range` = () => List(`@date`, `@datetime`)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}