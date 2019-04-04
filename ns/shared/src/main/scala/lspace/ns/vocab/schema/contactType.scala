package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object contactType extends PropertyDef(
        iri = "https://schema.org/contactType",
        iris = Set("https://schema.org/contactType"),
        label = "contactType",
        comment = """A person or organization can have different contact points, for different purposes. For example, a sales contact point, a PR contact point and so on. This property is used to specify the kind of contact point.""",
        `@extends` = () => List(),
        `@range` = () => List(`@string`)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}