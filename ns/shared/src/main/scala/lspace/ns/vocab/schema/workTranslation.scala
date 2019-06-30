package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object workTranslation extends PropertyDef(
        iri = "http://schema.org/workTranslation",
        iris = Set("http://schema.org/workTranslation"),
        label = "workTranslation",
        comment = """A work that is a translation of the content of this work. e.g. 西遊記 has an English workTranslation “Journey to the West”,a German workTranslation “Monkeys Pilgerfahrt” and a Vietnamese  translation Tây du ký bình khảo.""",
        `@extends` = () => List(),
        `@range` = () => List(CreativeWork.ontology)
       ){
}