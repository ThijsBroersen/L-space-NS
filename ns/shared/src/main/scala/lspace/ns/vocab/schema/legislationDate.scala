package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object legislationDate extends PropertyDef(
        iri = "http://schema.org/legislationDate",
        iris = Set("http://schema.org/legislationDate"),
        label = "legislationDate",
        comment = """The date of adoption or signature of the legislation. This is the date at which the text is officially aknowledged to be a legislation, even though it might not even be published or in force.""",
        `@extends` = () => List(dateCreated.property),
        `@range` = () => List(`@date`)
       ){
}