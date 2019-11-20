# Helper Functions

require 'sinatra'
require_relative('helpers.rb')

get '/' do
    render_view(:welcome)
end

get '/form' do
    render_view(:form)
end

post '/form' do
    @name = params[:name]
    render_view(:form)
end
