package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object dateCreated extends PropertyDef(
        iri = "http://schema.org/dateCreated",
        iris = Set("http://schema.org/dateCreated"),
        label = "dateCreated",
        comment = """The date on which the CreativeWork was created or the item was added to a DataFeed.""",
        `@extends` = List(),
        `@range` = List(`@date`, `@datetime`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}