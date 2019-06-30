package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object repeatCount extends PropertyDef(
        iri = "http://schema.org/repeatCount",
        iris = Set("http://schema.org/repeatCount"),
        label = "repeatCount",
        comment = """Defines the number of times a recurring <a class="localLink" href="http://schema.org/Event">Event</a> will take place""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){
}