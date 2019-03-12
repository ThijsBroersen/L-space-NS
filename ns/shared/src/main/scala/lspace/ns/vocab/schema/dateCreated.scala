package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object dateCreated extends PropertyDef(
        iri = "https://schema.org/dateCreated",
        iris = Set("https://schema.org/dateCreated"),
        label = "dateCreated",
        comment = """The date on which the CreativeWork was created or the item was added to a DataFeed.""",
        `@extends` = () => List(),
        `@range` = () => List(`@datetime`, `@date`)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}