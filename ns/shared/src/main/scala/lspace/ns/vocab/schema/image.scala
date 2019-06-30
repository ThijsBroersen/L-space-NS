package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object image extends PropertyDef(
        iri = "http://schema.org/image",
        iris = Set("http://schema.org/image"),
        label = "image",
        comment = """An image of the item. This can be a <a class="localLink" href="http://schema.org/URL">URL</a> or a fully described <a class="localLink" href="http://schema.org/ImageObject">ImageObject</a>.""",
        `@extends` = () => List(),
        `@range` = () => List(ImageObject.ontology, URL.ontology)
       ){
}