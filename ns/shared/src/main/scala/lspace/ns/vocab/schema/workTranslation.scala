package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object workTranslation extends PropertyDef(
        iri = "https://schema.org/workTranslation",
        iris = Set("https://schema.org/workTranslation"),
        label = "workTranslation",
        comment = """A work that is a translation of the content of this work. e.g. 西遊記 has an English workTranslation “Journey to the West”,a German workTranslation “Monkeys Pilgerfahrt” and a Vietnamese  translation Tây du ký bình khảo.""",
        `@extends` = () => List(),
        `@range` = () => List(CreativeWork)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}