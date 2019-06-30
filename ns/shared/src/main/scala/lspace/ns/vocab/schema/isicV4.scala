package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object isicV4 extends PropertyDef(
        iri = "http://schema.org/isicV4",
        iris = Set("http://schema.org/isicV4"),
        label = "isicV4",
        comment = """The International Standard of Industrial Classification of All Economic Activities (ISIC), Revision 4 code for a particular organization, business person, or place.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){
}